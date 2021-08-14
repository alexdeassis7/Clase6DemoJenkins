# Clase6DemoJenkins
ejemplo de automatización de tareas con Jenkins

Pre requisitos :

JAVA JDK => link descargar https://www.oracle.com/java/technologies/javase-jdk16-downloads.html

C:\Users\w112550\Downloads\openjdk-16+36_windows-x64_bin\jdk-16
C:\Program Files (x86)\Java\jdk1.8.0_144

GIT => link de descarga https://git-scm.com/downloads
C:\Program Files\Git\bin\git.exe


MAVEN => https://dlcdn.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip


Server Apache tomcat 9 => link de descargar https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.52/bin/apache-tomcat-9.0.52-windows-x64.zip



Paso a paso para realizar una tarea de automatizacion con Jenkins
1) levantar la app jenkins , puede ser por docker , un instalador o un war deployado en un containner (Tomcat);

a)para ejecutar desde docker : descargarmos la imagen (docker pull jenkins) y luego iniciamos el contenedor (recordar proxiar los puertos ) recordar copiar 
  password secret de la consola de docker para poder loguearse
   
b)para ejecutar en un tomcat descargar el .war desde https://www.jenkins.io/download/ y depositarlo dentro de la carpeta "webApps" de nuestro server tomcat
  luego iniciar el server con el script ubicado en apache-tomcat-9.0.52\bin\startup...
		cmd : apache-tomcat-9.0.52\bin>start startup.bat 
una vez inicializado por completo el tomcat accedemos a la url http://localhost:puerto/jenkins/ y
 logearnos con las credenciales por default (user:jenkins , password :jenkins)


