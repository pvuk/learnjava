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

#eclipse github login not working
##(Creating a fine-grained personal access token)[https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens]
Note

There is a limit of 50 fine-grained personal access tokens you can create. If you require more tokens or are building automations, consider using a GitHub App for better scalability and management. For more information, see Deciding when to build a GitHub App.

Verify your email address, if it hasn't been verified yet.

In the upper-right corner of any page on GitHub, click your profile photo, then click  Settings.

In the left sidebar, click  Developer settings.

In the left sidebar, under  Personal access tokens, click Fine-grained tokens.

Click Generate new token.

Under Token name, enter a name for the token.

Under Expiration, select an expiration for the token. Infinite lifetimes are allowed but may be blocked by a maximum lifetime policy set by your organization or enterprise owner. For more information, See Enforcing a maximum lifetime policy for personal access tokens.

Optionally, under Description, add a note to describe the purpose of the token.

Under Resource owner, select a resource owner. The token will only be able to access resources owned by the selected resource owner. Organizations that you are a member of will not appear if the organization has blocked the use of fine-grained personal access tokens. For more information, see Setting a personal access token policy for your organization.

Optionally, if the resource owner is an organization that requires approval for fine-grained personal access tokens, below the resource owner, in the box, enter a justification for the request.

Under Repository access, select which repositories you want the token to access. You should choose the minimal repository access that meets your needs. Tokens always include read-only access to all public repositories on GitHub.

If you selected Only select repositories in the previous step, under the Selected repositories dropdown, select the repositories that you want the token to access.

Under Permissions, select which permissions to grant the token. Depending on which resource owner and which repository access you specified, there are repository, organization, and account permissions. You should choose the minimal permissions necessary for your needs.

The REST API reference document for each endpoint states whether the endpoint works with fine-grained personal access tokens and states what permissions are required in order for the token to use the endpoint. Some endpoints may require multiple permissions, and some endpoints may require one of multiple permissions. For an overview of which REST API endpoints a fine-grained personal access token can access with each permission, see Permissions required for fine-grained personal access tokens.

Click Generate token.

If you selected an organization as the resource owner and the organization requires approval for fine-grained personal access tokens, then your token will be marked as pending until it is reviewed by an organization administrator. Your token will only be able to read public resources until it is approved. If you are an owner of the organization, your request is automatically approved. For more information, see Reviewing and revoking personal access tokens in your organization.

##Creating a personal access token (classic)
Note

Organization owners can restrict the access of personal access token (classic) to their organization. If you try to use a personal access token (classic) to access resources in an organization that has disabled personal access token (classic) access, your request will fail with a 403 response. Instead, you must use a GitHub App, OAuth app, or fine-grained personal access token.

Warning

Your personal access token (classic) can access every repository that you can access. GitHub recommends that you use fine-grained personal access tokens instead, which you can restrict to specific repositories. Fine-grained personal access tokens also enable you to specify fine-grained permissions instead of broad scopes.

Verify your email address, if it hasn't been verified yet.

In the upper-right corner of any page on GitHub, click your profile photo, then click  Settings.

In the left sidebar, click  Developer settings.

In the left sidebar, under  Personal access tokens, click Tokens (classic).

Select Generate new token, then click Generate new token (classic).

In the "Note" field, give your token a descriptive name.

To give your token an expiration, select Expiration, then choose a default option or click Custom to enter a date.

Select the scopes you'd like to grant this token. To use your token to access repositories from the command line, select repo. A token with no assigned scopes can only access public information. For more information, see Scopes for OAuth apps.

Click Generate token.

Optionally, to copy the new token to your clipboard, click .

Screenshot of the "Personal access tokens" page. Next to a blurred-out token, an icon of two overlapping squares is outlined in orange.
To use your token to access resources owned by an organization that uses SAML single sign-on, authorize the token. For more information, see Authorizing a personal access token for use with SAML single sign-on in the GitHub Enterprise Cloud documentation.

##Deleting a personal access token
You should delete a personal access token if it is no longer needed. If you delete a personal access token that was used to create a deploy key, the deploy key will also be deleted.

In the upper-right corner of any page on GitHub, click your profile photo, then click  Settings.
In the left sidebar, click  Developer settings.
In the left sidebar, under  Personal access tokens, click either Fine-grained tokens or Tokens (classic), depending on which type of personal access token you'd like to delete.
To the right of the personal access token you want to delete, click Delete.
Note

If you find a leaked personal access token belonging to someone else, you can submit a revocation request through the REST API. See Best practices for preventing data leaks in your organization.
