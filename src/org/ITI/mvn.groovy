package org.shared-lib

class Mvn {

    def javaBuild(String commandOpt) {
        steps.sh "mvn ${commandOpt}"
    }
}
