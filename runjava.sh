#!/bin/bash

# Get the full path of the Java file
FILE_PATH="$1"
# Get the workspace folder path
WORKSPACE_FOLDER="$2"
# Get the input file path
INPUT_FILE="$3"
# Get the output file path
OUTPUT_FILE="$4"

# Extract the package name from the file path
PACKAGE=$(dirname "${FILE_PATH#$WORKSPACE_FOLDER/}" | tr '/' '.')

# Extract the class name from the file name
CLASS_NAME=$(basename "$FILE_PATH" .java)

# Compile the Java file
javac -d "$WORKSPACE_FOLDER/out" "$FILE_PATH"

# Run the Java program with input and output redirection
java -cp "$WORKSPACE_FOLDER/out" "$PACKAGE.$CLASS_NAME" < "$INPUT_FILE" > "$OUTPUT_FILE"