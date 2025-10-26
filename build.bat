@echo off
echo 正在编译协议项目...

mkdir bin 2>nul

javac -cp "src" -d bin src/protocol/*.java

if %errorlevel% equ 0 (
    echo 协议项目编译成功!
) else (
    echo 协议项目编译失败!
    pause
    exit /b 1
)

pause