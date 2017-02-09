# Flavors_in_android_demoApp
A small android application to understand the concept of the Flavors in android.
---
####In this small demo application we are using two modules for showing two timetables of two different coaching classes.</br>
---
1)  To add modules to your project go to````File/New/New Module````and give some name.</br></br>
2)  Go to your `build.gradle(Module: app)` then add the code as below:</br>
          
           productFlavors {
            
                alphacoachingclass{ 
                    applicationId 'in.informationworks.alphacoachingclass'
                }
                betacoachingclass {
                    applicationId 'in.informationworks.betacoachingclass'
                }
            }
            
 3) Then in **dependencies** add below lines:</br>
 
    alphacoachingclassCompile project(':alphacoachingclass')
    betacoachingclassCompile project(':betacoachingclass')
 
