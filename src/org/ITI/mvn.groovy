package org.shared-lib

class Mvn implements Serializable {
    def steps

    Mvn(steps) {
        this.steps = steps
    }

    def javaBuild(String commandOpt) {
        steps.sh "mvn ${commandOpt}"
    }
}
