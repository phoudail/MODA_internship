# MODA_internship
This repository aims to implement an Xtext-based DSL that allows the user to create and use objects, following the MODA framework as defined in the following paper ( https://hal.inria.fr/hal-02612087 ).
There are two implementations of the language available in this project : the current one, and the older release tagged as "v0.9", which is based on a different version of the metamodel.

## xtext.share

While the three first projects in the repository correspond to the EMF model tied  to the DSL, due to git errors it was impossible to also upload the xtext project without breaking everything on my end; thus instead, the xtext.share project contains the relevant modified files as .txt format.
This means you have to generate an xtext project and its artifacts from the imported ecore model, and then paste the .txt files' code into the corresponding files in your actual project.

The MODAGenerator file's purpose is to convert a .moda file into a .ipynb file, containing Jupyter markdown cells that describe the resulting structure.
