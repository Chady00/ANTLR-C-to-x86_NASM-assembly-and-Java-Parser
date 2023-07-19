%include "asm_io.inc"
segment .bss
        a  resd 1
segment .text
        global asm_main
asm_main:
        enter 0,0
        pusha
        mov [a], eax
        mov eax, [a]
        shl eax, 1
        mov [a], eax
        call print_nl
        mov eax, [a]
        call print_int
        call print_nl
        mov eax, [a]
        call print_int
        call print_nl
        mov eax, [a]
        shl eax, 1
        mov [a], eax
        call print_nl
        mov eax, [a]
        call print_int
        call print_nl
        mov eax, [a]
        call print_int
        call print_nl
        popa
        mov eax,0
        leave
        ret