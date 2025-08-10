def mvmInstall() {
    def mvnTool = new org.shared-lib.Mvn()
    mvnTool.javaBuild("package install")
}
