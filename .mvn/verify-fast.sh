#!/bin/bash
set -e -u

#
# invoke integration test
#

cd "${BASH_SOURCE%/*}/.."

#./mvnw.sh clean verify -B -V -D invoker.test=test-1
#./mvnw.sh clean verify -B -V -D invoker.test=test-2
#./mvnw.sh clean verify -B -V -D invoker.test=test-3
./mvnw.sh clean verify -B -V -D invoker.test=test-4
