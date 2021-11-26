import numpy as np
import cv2
from os import listdir, path, mkdir

def rotate_image(image, angle):
	image_center = tuple(np.array(image.shape[1::-1]) / 2)
	rot_mat = cv2.getRotationMatrix2D(image_center, angle, 1.0)
	result = cv2.warpAffine(image, rot_mat, image.shape[1::-1], flags=cv2.INTER_LINEAR)
	return result

def convert_to_gray(image, luma=False):
    return cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

def blur_image(image, intensity): 
	size = int(60 * intensity) if intensity >= 0.05 else 3
	ksize = (size, size)
	image_t = cv2.blur(image.copy(), ksize, cv2.BORDER_DEFAULT) 
	
	return image_t

def equalize_hist(image): 
	if (len(image.shape)==3):
		img_to_yuv = cv2.cvtColor(image,cv2.COLOR_BGR2YUV)
		img_to_yuv[:,:,0] = cv2.equalizeHist(img_to_yuv[:,:,0])
		hist_equalization_result = cv2.cvtColor(img_to_yuv, cv2.COLOR_YUV2BGR)
		return hist_equalization_result
	elif (len(image.shape)==2):
		img_eq = cv2.equalizeHist(image)
		return img_eq

def show_image(image):
	cv2.imshow('Altered', image)
	cv2.waitKey(0)
	cv2.destroyAllWindows()

def save_image(image, output_dir):
	if (not path.exists(output_dir)):
		mkdir(output_dir)
	output_image_full_path = path.join(output_dir, image_name)
	cv2.imwrite(output_image_full_path, img)

def fill_image(img, _size):
	size=(_size, _size)
	if(len(img.shape)==3):
		h, w, c = img.shape
	else:
		h, w = img.shape
	c = img.shape[2] if len(img.shape)>2 else 1
	if h == w: 
		return cv2.resize(img, size, cv2.INTER_AREA)
	dif = h if h > w else w
	interpolation = cv2.INTER_AREA if dif > (size[0]+size[1])//2 else cv2.INTER_CUBIC
	x_pos = (dif - w)//2
	y_pos = (dif - h)//2
	if len(img.shape) == 2:
		mask = np.zeros((dif, dif), dtype=img.dtype)
		mask[y_pos:y_pos+h, x_pos:x_pos+w] = img[:h, :w]
	else:
		mask = np.zeros((dif, dif, c), dtype=img.dtype)
		mask[y_pos:y_pos+h, x_pos:x_pos+w, :] = img[:h, :w, :]
 
	return cv2.resize(mask, size, interpolation)

for image_name in listdir('./imagens/'):
	image_full_path = path.join('./imagens/', image_name)
	img = cv2.imread(image_full_path)
	if not img is None:
		img = fill_image(img, 800)
		img = rotate_image(img, 180)
		img = blur_image(img, 0.75)
		show_image(img)
		
