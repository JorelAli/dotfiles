# Vim

## 10th April 2019
### Marks
Make "bookmarks" within a file to quickly jump around a file. To do this, you can use `m#` where # is a letter to set a bookmark. To view bookmarks, you type `:marks`. To teleport to a predefined bookmark, use ``#` where `#` is the bookmark letter 

### Shell switching
So, when you want to "go back" to the shell to see  what you've typed, you can just use `:!` (the empty command) and it'll make an entry. If you want to use the shell for more than 1 command, you can always just open another shell (e.g. `:!fish`)

### Command execution -> buffer
So, say you run a command and want that to go straight to vim, whilst you're in vim. `:r !COMMAND` will run the command and paste the results into vim at your current cursor location

### File name in shell
When using a command via `:!` or `:r !`, you can supply the current file name using the `%` symbol

### Macros
Recording Macros:

1. Press `q` followed by another letter (e.g. `qa`)
2. Record your macro (i.e. the steps you want to perform)
3. Press `q` to stop recording

Executing Macros: 

1. Press `@#` where `#` is the letter for your macro (e.g. `@a`)
2. Press `@@` to execute the last macro
3. (Press `.` to execute the previous command (i.e. previous macro))

### Indentation
So, you already know about `gg=G`. But how does it work? `gg` goes to the top of the file. `=` is used to "auto-format" something (according to vim cheatsheets). `=` is an "operator", which means **It needs a value to act upon**. In this case, it acts upon `G` (i.e. indents everything up until the end of the file, because we're at the start).

An example of where you'd use this would be say to indent something within a pair of braces. `=i{` is "auto format **inside** (the paragraph starting with) {"

## 14th April 2019
### Copying to system clipboard
To copy to the main clipboard, you use `"+y`. `+` is the name of a register for the system clipboard. `"` is the register command. It lets you access registers. Using `dd` for example is basically equivalent to `""dd` (select the `"` register (default unnamed register) and then perform the action `dd`. This means that `"+y` means "select the system clipboard register and then yank"

## 16th April 2019
### Delete til end
To delete from the current position to the end of the line, do NOT use `dt` (delete til...). Instead, use `d$` or, even better, just use `D`. 
