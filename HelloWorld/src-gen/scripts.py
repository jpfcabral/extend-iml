import numpy as np
import cv2

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

def fill_image(img, size=(_size,_size)):
    h, w = img.shape[:2]
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

img = cv2.imread('no.jpg')

img = rotate_image(img, 90)
img = convert_to_gray(img)
img = rotate_image(img, 45)
img = blur_image(img, 0.25)
img = equalize_hist(img)

# DEBUG 

org.xtext.example.iml.extendedIML.impl.ModelImpl@3b4302e1
org.xtext.example.iml.extendedIML.impl.DirImporterImpl@5ad75f3f (pathDir: no.jpg)
org.xtext.example.iml.extendedIML.impl.RotateOperationImpl@479378 (var: A) (degree: 90)
org.xtext.example.iml.extendedIML.impl.FilterOperationImpl@2587741e (var: A)
org.xtext.example.iml.extendedIML.impl.RotateOperationImpl@6f03e45 (var: A) (degree: 45)
org.xtext.example.iml.extendedIML.impl.BlurOperationImpl@663ea703 (var: A) (intensity: 25)
org.xtext.example.iml.extendedIML.impl.ShowImpl@5ade24ef (var: A)
org.xtext.example.iml.extendedIML.impl.SaveImpl@44678c2e (var: A)
org.xtext.example.iml.extendedIML.impl.EqualizeOperationImpl@436280f1 (var: A)