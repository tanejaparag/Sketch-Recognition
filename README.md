# Sketch-Recognition

This project aims at recognizing sloppy sketches using deep learning convolutional model. After
recognizing the sketch, it fetches the learning content for the targeted audience using Google Search API.
The dataset for the sketches is collected for around 250 objects from Tu Berlin. Implementing theoretical
knowledge gained in classes such as Learning Agents, Supervised Machine Learning, etc. into a real-time
application. A kid’s sloppy sketches can be made into a fun learning activity which will help to educate the
child through visual content. And this could be a great idea to keep children away from cartoons.


The term image classification refers to the labeling of images into one of several predefined categories.
Although this is always not a difficult task for humans, it has proved to be an extremely difficult problem
for machines. Therefore, how to extract the key information from a bunch of low-level features and use
them to represent an image is the crucial part for classification. In this project, the main procedure can be
split into 3 parts: image segmentation, representation and classification. Image segmentation is trying to
segment image into regions such that each region is roughly homogeneous in color and texture and Image
representation concentrates on how to use low-level features to represent an image. (Low-level feature
e.g.: color, texture, shape, structure, etc.).

In this image classification project, the main goal is to recognize sloppy sketches using deep learning
convolutional model. Based on the class of the image i.e. output from the model, the learning content
related to the same keyword will be fetched using Google Search API for the targeted audience. There are
number of convolutional models available in the market based on the different layers they use and the
features they capture of the images. Choosing the best model out of all these that performed the best for
our application was a key criterion. First we experimented with different models and finally the VGG19
model was selected and TU Berlin dataset was utilized which has 20,025 images of different sketches
categorized by functional type and with relative attribute comparisons for all the model training, testing
and validation. Comparison of performance of all the different models was conducted. The performance
is enhanced even more by using fine tuning layer as the last layer on it and the phenomenal accuracy of
96.23 % is achieved.

*Images for Training and Testing Model is missing in this repo. It can be downloaded from - http://cybertron.cg.tu-berlin.de/eitz/projects/classifysketch/
