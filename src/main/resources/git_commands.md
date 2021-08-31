> $ git shortlog -se
    `4  P V UdayKiran <Priyanka@LAPTOP-OJ9GMP1L>
    37  P V UdayKiran <pvuk1988@gmail.com>
     6  P. V. UdayKiran <pvuk1988@gmail.com>
    17  Priyanka <Priyanka@LAPTOP-OJ9GMP1L>
     1  Venkata UdayKiran <pvuk1988@gmail.com>
   101  Venkata UdayKiran <pvuk@users.noreply.github.com>
    16  udaykiran pulipati <udaykiran pulipati@DESKTOP-4MF8HRC>
   156  venkata udaykiran p <venkataudaykiranp@h-PUday.ffe.foxeg.com>
     2  venkataudaykiranp <venkataudaykiranp@h-Udayp.ffe.foxeg.com>`
This will print out a list of all authors in your history sorted alphabetically, including email addresses and the number of commits per author.

By default this analyzes the history leading to HEAD, i.e. everything leading to the current commit.
I think this is exactly what you want.

You can sort by commit count using -n to find out the most important committers.

> $ git shortlog -sen
    `156  venkata udaykiran p <venkataudaykiranp@h-PUday.ffe.foxeg.com>
    101  Venkata UdayKiran <pvuk@users.noreply.github.com>
    37  P V UdayKiran <pvuk1988@gmail.com>
    17  Priyanka <Priyanka@LAPTOP-OJ9GMP1L>
    16  udaykiran pulipati <udaykiran pulipati@DESKTOP-4MF8HRC>
     6  P. V. UdayKiran <pvuk1988@gmail.com>
     4  P V UdayKiran <Priyanka@LAPTOP-OJ9GMP1L>
     2  venkataudaykiranp <venkataudaykiranp@h-Udayp.ffe.foxeg.com>
     1  Venkata UdayKiran <pvuk1988@gmail.com>`


## If you want to check or set the user name and email you can use the below command

# Check user name
> git config user.name

# Set user name
> git config user.name "your_name"

# Check your email
> git config user.email

# Set/change your email
> git config user.email "your@email.com"

# List/see all configuration
> git config --list