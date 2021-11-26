import numpy as np
import cv2

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

# DEBUG 

org.xtext.example.iml.extendedIML.impl.ModelImpl@71226ef9
org.xtext.example.iml.extendedIML.impl.DirImporterImpl@59fb952c (pathDir: no.jpg)
org.xtext.example.iml.extendedIML.impl.RotateOperationImpl@1cb3db19 (var: A) (degree: 90)
org.xtext.example.iml.extendedIML.impl.FilterOperationImpl@76aebf35 (var: A)
org.xtext.example.iml.extendedIML.impl.RotateOperationImpl@149942bf (var: A) (degree: 45)
org.xtext.example.iml.extendedIML.impl.BlurOperationImpl@11cee7f5 (var: A) (intensity: 25)
org.xtext.example.iml.extendedIML.impl.ShowImpl@13279dc6 (var: A)
org.xtext.example.iml.extendedIML.impl.SaveImpl@1073cf80 (var: A)