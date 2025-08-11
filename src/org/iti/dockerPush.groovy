package org.iti;

def dockerPush(String imageName, String buildNumber) {
    sh "docker push ${imageName}:v${buildNumber}"
}
