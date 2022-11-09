# StuMan

The Springboot application that we developed is based on the “Educational Sector”.

"StuMan" is a system for student and Course details management. You can perform CREATE, READ, UPDATE, and DELETE operations on the student and module details of a relevant degree program, It consists of a 

- Landing Page
- Student Page
- Course Page
- Student Redistration Form 
- Course Registration Form
- Student Result Page

## Files and Folders

StuMan consists of .idea, .mvn, .settings, bin, src, resources and test folders. Under the StuMan folder, there are Controller, Domain, Repository and Service subfolders. Under the templates folder inside the resources folder, we have created our HTML pages.

```bash

+---java
|   \---com
|       \---example
|           \---StuMan
|               |   StuManApplication.java
|               |   
|               +---Controller
|               |       AllResultController.java
|               |       IndexController.java
|               |       ModuleController.java
|               |       ResultController.java
|               |       StudentController.java
|               |       
|               +---Domain
|               |       AllResult.java
|               |       Module.java
|               |       Result.java
|               |       Student.java
|               |       
|               +---Repository
|               |       AllResultRepository.java
|               |       ModuleRepository.java
|               |       ResultRepository.java
|               |       StudentRepository.java
|               |       
|               \---Service
|                       AllResultService.java
|                       ModuleService.java
|                       ResultService.java
|                       StudentService.java
|                       
\---resources
    |   application.properties
    |   
    +---static
    \---templates
        |   addmodule.html
        |   addresults.html
        |   addstudent.html
        |   AllResult.html
        |   index.html
        |   Module.html
        |   Student.html
        |   
        +---comman
        |       header.html
        |       
        \---images

```

## Team Members 

- 194091R - LIYANAGE I.S (Team Leader)
- 194040L - FERNANDO H.C.D
- 194042U - FERNANDO W.W.B.N
- 194063J - ILANGASINGHE U.P.H.
- 194057U - HETTIARACHCHI H.S.C.
- 194180N - WELIHINDA V.C.



