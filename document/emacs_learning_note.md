1. 官方教程文档
   M -x help-with-tutorial (Ctrl -h t)
   M -x describe-variable (Ctrl -h v)
   M -x	describe-function (Ctrl -h f)
   M -x describe-key	  (Ctrl -h k)

2. Ctrl -v 查看下一个屏幕
   M -v 返回上一个屏幕
   C -u C -v 将当前光标所在行移动到屏幕上方

3. 上下左右移动
   C -p		移动到上一行
   C -n		移动到下一行
   C -b		回退一个字
   C -f		前进一个字

4. C -l		光标在屏幕中央、上、下移动

5. M -b		一个单词一个单词的后移
   M -f		一个单词一个单词前移

6. C -a		移到一行的开头（只能移动一行的开头）
   C -e		移到一行的结尾（只能一行的结尾）
   M -a		移动多行
   M -e		移动多行

7. C - ->	一个单词一个单词前移
   C - ->	一个单词一个单词后移
   
   C S <	移动到文档开头
   C S >	移动到文档末尾

8. C -u num C -b (C -f)	 可以将指令重复num 次。
   C -u 10 C -f     	 往前移动10个字符
   M -9 C -f		 往前移动9个字符
   C -u C -n 		 移动4行   
   C -u C -u C -n 	 移动16行
   C -u C -u C -u C -n	 移动64行
   M -g g      	    	 跳到指定的行

9. C -g 停止一个响应很长时间的指令

10. 当运行一个不存在的指令时，你希望它运行输入 space bar，
    不希望运行时输入 n。

11. 当打开多个窗口时，希望关闭其他窗口
    C -x num(C -x 1)

12. 删除
    C -d	删除光标的下一个字符
    M -<DEL>	删除光标前一个单词
    M -d	删除光标后一个单词
    C -k	删除从光标开始到行结尾
    M -k	删除当前语句到结尾

    复制粘贴
    C + Shift + @ 做标记
    C + w     剪切标记到光表之间的内容
    C + y     显示前切板的内容

13. 恢复删除的内容（yanking）
    C -y	回复删除的内容
    M -y	重复按会出现删除的多数内容

14. 撤销（Undo）
    C -/
    C -x u 

15. C -x C -f	查找文件
    C -x C -s	存储文件
    C -x s 	存储所有的缓冲
    C -x C -c 	退出emacs

16. C -x C-b	列表显示Buffers

17. 暂时离开emacs C -z
    fg 返回emacs
    %emacs 同样返回emacs

18. 总结
    C -o                在光标下一行插入空行
    C -x k              关掉缓冲区
    C -x C -f		find file
    C -x C -s		save file
    C -x C -w       save as
    C -x s 		save some buffers
    C -x C -b		list buffers
    C -x b 		switch	buffers
    C -x C -c 		quit emacs
    C -x 1 		delete all but one window
    C -x h              select all
    C -x u		undo
    c -_ 		undo
    C /	 		undo
    M -x recover file<Return>
    C + enb      跳到文章最后一行
    C + home     跳到文章第一行
    M + C + <[>] 跳到文章的开始或结尾
    M -q         重整理当前段落
    C -t         交换字符
    M -t         交换单词
    M -l         把光标处的单词变成小写
    M -u         把光标处的单词变成大写
    M -c         把光标处的单词第一个字符变成大写，并把后面的变成小写
    
19. major mode
    M -x fundanebtal-mode
    M -x text-mode (human language text)
    M -h m 查看当major mode 的说明

20. 搜索
    c -s	从光标出往后搜索（当确认搜索结果后，继续c -s 跳到下一个满足的条件）
    c -r 	从光标出往前搜索
    c -s c -s   将上一次的搜索值作为本次搜索内容
    c -r c -r   同上
    c m -r      正则表达式搜索
    c m \       将一个区域缩进    
    
21. 多窗口
    C -x num	num 为2 上下分屏，num 为3 时左右分屏
    C M -v	可以down 底下（另一个）的窗口
    C M S -v 	可以up 底下（另一个）的窗口
    C -x o 	移动光标到另一个窗口
    C -x 4 c -f 打开的文件会在第二个窗口
    
    在没有M 键的系统中，可以用Esc 代替M
    ESC C -v
    
    退出递归编辑，不能使用C -gOB
    ESC ESC ESC

22. help
    C -h ?	查看系统提供的所有帮助
    C -h char	查看char 代表的帮助
    C -h c 组合键 获取组合键的功能，例如：
    C -h c c -p	查看[c -p]的功能
    c -h k c -p 获取更多的功能信息
    C -h f previous-line 查看函数的功能
    C -h t      启动官方教程
    C -h b      列出所有的有效键绑定
    C -h w      查找一个命令被绑定到了哪些键上
    C -h a file 查找一个匹配一段描述的命令，例如：
    C -h a file<Return> 返回包含file 的所有命令列表
    
    C -h m      显示当前激活的所有模式的信息
    C -h v 	查看Emacs 变量文档，变量可以用来定制Emacs 的行为   

    M -x help<Return> 打开帮助 = C -h ?
    
23. 不打开图形界面
    emacs -nw

24. 去掉颜色主题
    emacs -nw --color=no

25. 作为守护进程，然后用客户端连接
    emacs --daemon

    用客户端连接emacs 
    emacsclient -t

26. 区分删除（delete）和移除（kill）
    删除的内容不可召回，移除的内容还可以召回。

27. 关闭Emacs 的自动备份
    M -x customize-variable <Return> make-backup-files <Return>

28. Emacs 自动保存
    默认会生成#hello# 的自动缓存文件，从新打开源文件后：
    M -x recover file<Return>

29. 自动折行模式
    当编辑的一行超过屏幕的显示区域时，Emacs 将自动换行
    M -x auto-fill-mode<Return> 如果打开则关闭，如果关闭则打开
    
    在段落中做了一些修改不会自动折行，需要
    M -q 手动折行

30. 目录编辑功能
    M -x dired 目录编辑功能 q 退回上一级
    C -x C -q 启动目录编辑功能
    C -c C -c 保存退出


31. 编码设置
	C -x ret r utf-8 ret 重置当前缓冲区的编码
	M -x revert-buffer-with-coding-system 修改缓冲区的编码
	M -x set-buffer-file-coding-system 指定保存文件的编码方式

	
31. 俄罗斯方块
    M -x tetris
