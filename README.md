## **Instructions:**

*   Head to the example directory, paste the following commands in your CML in order:

<table><tbody><tr><td>&nbsp; &nbsp;1. REM Set the CLASSPATH variable<br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<strong>SET CLASSPATH=.;C:\Java Lib\antlr-4.12.0-complete.jar</strong></td></tr><tr><td>&nbsp; &nbsp;2. REM Generate the ANTLR lexer and parser for MyLanguageV1Code.g4<br>&nbsp; &nbsp; &nbsp; &nbsp;<strong> &nbsp;antlr MyLanguageV1Code.g4</strong></td></tr><tr><td>&nbsp; &nbsp;3. REM Run the ANTLR tool to generate the parser classes<br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<strong> java org.antlr.v4.Tool MyLanguageV1Code.g4</strong></td></tr><tr><td>&nbsp; &nbsp;4. REM Compile the generated Java files<br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<strong>javac MyLanguageV1Code*.java</strong></td></tr><tr><td>&nbsp; &nbsp;5.1. REM Run the "grun" utility to execute the parser on the input file "example.txt"<br>&nbsp; &nbsp; &nbsp;<strong> &nbsp;grun MyLanguageV1Code program example.txt</strong></td></tr><tr><td>&nbsp; &nbsp;5.2. REM Or Display the “GUI” of the parsed tree<br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; grun MyLanguageV1Code program example.txt <strong>-gui</strong></td></tr></tbody></table>

*   To assemble and link an assembly language Netwide Assembler (NASM) program with C code on a **Linux system:**

<table><tbody><tr><td><p># Assemble the assembly file `asm_io.asm` to generate `asm_io.o` object file in ELF format&nbsp;</p><ul><li><strong>nasm -f elf -d ELF_TYPE asm_io.asm</strong></li></ul></td></tr><tr><td><p># Compile the C source files `driver.c` and `myprog.c`, along with `asm_io.o`, into `a.out` executable&nbsp;</p><ul><li><strong>gcc -m32 driver.o myprog.o asm_io.o</strong></li></ul></td></tr><tr><td><p># Execute the resulting program (a.out) that was generated from the C and assembly code&nbsp;</p><ul><li><strong>./a.out</strong></li></ul></td></tr></tbody></table>

---

## Output Samples:

*   `Generated NASM x86 assembly code from Classical C input:`
   ![image](https://github.com/Chady00/ANTLR-C-to-x86_NASM-assembly-and-Java-Parser/assets/84717550/6b09fe40-582c-4d4d-b650-4db7889fa476)

*   `Parse Tree Tool - Each statement generated on the left - Ability to export as PNG or SVG:`
    ![image](https://github.com/Chady00/ANTLR-C-to-x86_NASM-assembly-and-Java-Parser/assets/84717550/37047fa5-6c3d-4caf-8157-842adc57efe9)

*   `Output Tree:`
  ![image](https://github.com/Chady00/ANTLR-C-to-x86_NASM-assembly-and-Java-Parser/assets/84717550/52773db8-6bd7-484b-a0a8-12ea34b6e147)



