#!/bin/bash
# filename : variables.sh

fruit=apple
count=5
echo "We have $count ${fruit}(s)"

if [ $UID -ne 0 ]; then
    echo Non root user.
else
    echo "root user."
fi
