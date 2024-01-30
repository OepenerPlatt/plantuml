@Rem
@Rem Call maven build
@Rem
@Rem echo off

set JAVA_HOME=c:\KWE\Devel\eclipse\Runtime\jdk-17.0.9+9\

set MAVEN_OPTS=-Xmx1024m

if "%1" == "" goto default

c:\KWE\Devel\eclipse\apache-maven-3.8.1\bin\mvn.cmd %1 %2 %3 %4 %5

:default

Rem c:\KWE\Devel\eclipse\apache-maven-3.9.6\bin\mvn.cmd package -Pall-platforms

c:\KWE\Devel\eclipse\apache-maven-3.9.6\bin\mvn.cmd clean install

