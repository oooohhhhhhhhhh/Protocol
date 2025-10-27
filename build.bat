@echo off
chcp 65001 > nul
echo ========================================
echo       编译通用协议模块
echo ========================================

set SRC_DIR=src
set BIN_DIR=bin
set LIB_DIR=..

if not exist "%BIN_DIR%" mkdir "%BIN_DIR%"

echo.
echo 编译协议类...
javac -encoding UTF-8 -d "%BIN_DIR%" "%SRC_DIR%\protocol\*.java"

if errorlevel 1 (
    echo ❌ 编译失败!
    pause
    exit /b 1
)

echo.
echo 创建JAR包...
cd "%BIN_DIR%"
jar cf protocol.jar protocol/*.class
move protocol.jar "../lib/" > nul
cd ..

echo.
echo ========================================
echo   ✅ 通用协议模块编译成功！
echo   JAR包已生成: ../lib/protocol.jar
echo ========================================
echo.
pause