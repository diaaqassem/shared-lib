package org.ITI.shared-lib;

def javaBuild(COMMAND_OPT){
    sh "mvn ${COMMAND_OPT}"
}