@echo off
REM Usage: script\run.bat first
if "%1"=="" (
    echo Usage: %0 EXERCISE_NAME
    exit /b 1
)

cd /d "%~dp0.."
clojure -M -m run %1
