cmake_minimum_required(VERSION 3.18)

# set(CMAKE_C_COMPILER "C:/Program Files/mingw-w64/x86_64-8.1.0-posix-seh-rt_v6-rev0/mingw64/bin/gcc.exe")
# set(CMAKE_CXX_COMPILER "C:/Program Files/mingw-w64/x86_64-8.1.0-posix-seh-rt_v6-rev0/mingw64/bin/g++.exe")

project(lib)

add_definitions(-DBUILD_DLL)

# set (CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -fPIC -shared -o lib.so")
# set (CMAKE_CXX_FLAGS "${CMAKE_C_FLAGS} -fPIC -shared -o lib.so")

include_directories("${PROJECT_SOURCE_DIR}/include")
include_directories("C:\\jdk-16.0.1\\include")
include_directories("C:\\jdk-16.0.1\\include\\win32")

add_subdirectory("${PROJECT_SOURCE_DIR}/src")

add_library(lib SHARED 
    $<TARGET_OBJECTS:lib_obj>
)

#target_link_directories(lib PUBLIC "${PROJECT_SOURCE_DIR}/src")