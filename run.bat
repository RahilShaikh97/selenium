set projectLocation=C:\Users\shaik\eclipse-workspace\Java\TestNG
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml