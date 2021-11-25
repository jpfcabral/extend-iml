import numpy as np
import cv2

def rotate_image(image, angle):
	image_center = tuple(np.array(image.shape[1::-1]) / 2)
	rot_mat = cv2.getRotationMatrix2D(image_center, angle, 1.0)
	result = cv2.warpAffine(image, rot_mat, image.shape[1::-1], flags=cv2.INTER_LINEAR)
	return result
org.xtext.example.iml.extendedIML.impl.ModelImpl@490b7441
org.xtext.example.iml.extendedIML.impl.DirImporterImpl@919d1ef (pathDir: /A/)
org.xtext.example.iml.extendedIML.impl.RotateOperationImpl@41b68e5f (var: A) (degree: 90)
org.xtext.example.iml.extendedIML.impl.FilterOperationImpl@32c9ae5 (var: A)
org.xtext.example.iml.extendedIML.impl.BlurOperationImpl@11174fbd (var: A)