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

#### Updating root passwof
```
mysql_secure_installation
```
Say no to strengthen password and yes to all other options.  Make sure you type 'root' as the password without quotes.

#### Try connect to mysql
```
mysql -u root -p
```
