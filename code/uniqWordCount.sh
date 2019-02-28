#!/bin/bash
# Read from the file words.txt and output the word frequency list to stdout.


if [ "$1" = "" ]; then
   echo "Usage: $0 <filename>"
   exit 1
fi

cat $1 | awk '{for(i=1;i<=NF;i++) print $i;}'| sort|uniq -c | sort -r | awk '{ print $2, $1 }'
