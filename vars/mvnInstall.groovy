def mvmInstall() {
    def mvnTool = new org.shared-lib.Mvn(this)
    mvnTool.javaBuild("package install")
}
