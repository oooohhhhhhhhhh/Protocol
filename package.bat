@echo off
echo 正在打包协议项目为JAR...

call build.bat

if %errorlevel% equ 0 (
    jar cf protocol.jar -C bin .
    echo 协议JAR包创建成功: protocol.jar
) else (
    echo 打包失败!
)

pause