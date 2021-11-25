import numpy as np
import cv2
from os import listdir, path, mkdir

def rotate_image(image, angle):
	image_center = tuple(np.array(image.shape[1::-1]) / 2)
	rot_mat = cv2.getRotationMatrix2D(image_center, angle, 1.0)
	result = cv2.warpAffine(image, rot_mat, image.shape[1::-1], flags=cv2.INTER_LINEAR)
	return result

def convert_to_gray(image, luma=False):
    if luma:
        params = [0.299, 0.589, 0.114]
    else:
        params = [0.2125, 0.7154, 0.0721]    
    gray_image = np.ceil(np.dot(image[...,:3], params))
    gray_image[gray_image > 255] = 255
    
    return gray_image

def blur_image(image, intensity): 
	size = int(60 * intensity) if intensity >= 0.05 else 3
	ksize = (size, size)
	image_t = cv2.blur(image.copy(), ksize, cv2.BORDER_DEFAULT) 
	
	return image_t

def equalize_hist(image): 
	img_to_yuv = cv2.cvtColor(image,cv2.COLOR_BGR2YUV)
	img_to_yuv[:,:,0] = cv2.equalizeHist(img_to_yuv[:,:,0])
	hist_equalization_result = cv2.cvtColor(img_to_yuv, cv2.COLOR_YUV2BGR)
	
	return hist_equalization_result

for image_name in listdir('imagens'):
	image_full_path = path.join('imagens', image_name)
	img = cv2.imread(image_full_path)
	if not img is None:
		img = rotate_image(img, 40)
		img = convert_to_gray(img)
		img = rotate_image(img, 45)
		img = blur_image(img, 0.25)
		
		output_dir = path.join('imagens', 'output')
		if (not path.exists(output_dir)):
			mkdir(output_dir)
		output_image_full_path = path.join(output_dir, image_name)
		cv2.imwrite(output_image_full_path, img)
