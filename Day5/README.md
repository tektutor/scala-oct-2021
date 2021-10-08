### Installing MySQL Server in CentOS
```
sudo yum install -y epel-release
sudo yum install -y mysqld
```

#### Starting mysql server
```
sudo systemctl enable mysqld
sudo systemctl start mysqld
sudo systemctl status mysqld
```
You need to press letter 'q'

#### Updating root password
```
mysql_secure_installation
```
Say no to strengthen password and yes to all other options.  Make sure you type 'root' as the password without quotes.

#### Try connect to mysql
```
mysql -u root -p
```

### Running the Database application
```
cd ~/scala-oct-2021
git pull
cd Day5/DBApp
sbt compile && sbt run
```
The expected output is
<pre>
5
[info] welcome to sbt 1.5.5 (Red Hat, Inc. Java 11.0.12)
[info] loading project definition from /home/jegan/scala-oct-2021/Day5/DBApp/project
[info] loading settings for project dbapp from build.sbt ...
[info] set current project to dbapp (in build file:/home/jegan/scala-oct-2021/Day5/DBApp/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 1 Scala source to /home/jegan/scala-oct-2021/Day5/DBApp/target/scala-3.1.0-RC2/classes ..
[success] Total time: 5 s, completed Oct 7, 2021, 11:26:12 PM
[info] welcome to sbt 1.5.5 (Red Hat, Inc. Java 11.0.12)
[info] loading project definition from /home/jegan/scala-oct-2021/Day5/DBApp/project
[info] loading settings for project dbapp from build.sbt ...
[info] set current project to dbapp (in build file:/home/jegan/scala-oct-2021/Day5/DBApp/)
[info] running DBAppDemo 
Thu Oct 07 23:26:21 PDT 2021 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
host = localhost, user = mysql.infoschema
host = localhost, user = mysql.session
host = localhost, user = mysql.sys
host = localhost, user = root
[success] Total time: 2 s, completed Oct 7, 2021, 11:26:22 PM
</pre>
