#!/bin/bash
cd /home/soumith/workspace/
git add .
echo "enter message"
read m
git commit -m "$m"
#git remote add origin https://github.com/soumithx/$directory_name.git
git push origin master

