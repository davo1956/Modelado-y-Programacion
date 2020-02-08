	.file	"programa3.c"
	.section	.rodata
.LC0:
	.string	"Eres mayor de edad"
.LC1:
	.string	"Eres menor de edad "
	.text
	.globl	main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	$10, -4(%rbp)
	cmpl	$17, -4(%rbp)
	jle	.L2
	movl	$.LC0, %edi
	call	puts
	jmp	.L3
.L2:
	movl	$.LC1, %edi
	call	puts
.L3:
	movl	$0, %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.ident	"GCC: (Ubuntu 5.4.0-6ubuntu1~16.04.11) 5.4.0 20160609"
	.section	.note.GNU-stack,"",@progbits
