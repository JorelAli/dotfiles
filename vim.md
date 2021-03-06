# Vim

## 10th April 2019
### Marks
Make "bookmarks" within a file to quickly jump around a file. To do this, you can use `m#` where # is a letter to set a bookmark. To view bookmarks, you type `:marks`. To teleport to a predefined bookmark, use ``#` `` where `#` is the bookmark letter 

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

## 4th May 2019
### Go back to last location
When opening a file, if you want to go back to where you were last editing something, you can type `'"` to go back to that previous location, or even easier: \`.

## 12th May 2019
### Remove highlighting when searching for something
When you search for stuff in neovim, it highlights all instances that it finds. To "unhighlight" it, you can use the `:noh` command.

## 18th June 2019
### Vim sessions!
To save a vim session (files opened, vim window splits etc) you can use `:mksession <sessionName>` to create a session. This stores the session in a file called `<sessionName>` (with whatever filetype you put at the end of it) in the current working directory. To load a session, you can use `:source <sessionName>` to load that session

## 12th September 2019
### Vim shared clipboards
If you have multiple vim instances spread across multiple vim sessions, it's often difficult to copy and paste between them. This is easily handled using shared clipboards, which is done using the setting `set clipboard^=unnamed`. The significance of the `^=` operator is that it prepends it to the current existing setting. For example, if the setting is "blah", it will set it to "unnamed, blah".

### Viewing current settings
You can use the ? operator after the `:set` command to view a setting. For example, to view the current clipboard setting, you'd use `:set clipboard?`

### Activating spell check
When a squiggly line appears under a word in vim, you can put your cursor over it and enter `z=` to bring up the list of suggestions to replace it with.

## 3rd October 2019
### LaTeX editing environment
Use of the vim-latex-live-preview is great. It's started up by using `:LLPStartPreview` and will open a PDF viewer of your choice.

## 13th November 2019
### Converting DOS line endings to unix ones
You can type `:set ff=unix` to convert all \r\n line endings into \n line endings

## 5th February 2020
### Deleting from the start of a line to the cursor
Using `d0` deletes all of the text from the start of the line to the current cursor.

## 28th March 2020
### Deleting sentences in markdown
You can delete sentences using `das`, which stands for 'delete around sentence'

### Moving the cursor to the middle of the page
Sometimes, the cursor is not where you want it! Especially when writing markdown for example, sometimes you want the cursor in a specific location (not at the top/bottom of the page). Using `zz` moves the cursor to the middle (vertically) of the screen.

### Yank current character
`yl` is used to yank the current character. Technically, it yanks the character to the right
