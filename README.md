This fork includes a hack which is a workaround for the following bug: https://issues.jenkins-ci.org/browse/JENKINS-26990

Basically, this plugin at some point converts text parameters to string parameters and because I couldn't find the exact spot, I just added some code which checks if a string parameter contains a newline and if so, converts it to a text parameter (newlines are lost in normal string parameters).

This hack can be found on the branch 'hack', which is based on the tag 'project-inheritance-1.5.3'.

ORIGINAL README
===============

This project contains the source code of the "Inheritance Plugin" for
Jenkins.

The source code is released under the LGPL v3. You can find the full
licence text in the LICENCE file.


The purpose of this plugin is to bring true inheritance of properties 
between multiple job definitions to Jenkins. This allows you to define
common properties only once and inherit them to multiple projects. Ideal
candidates for this are, for example, the SCM setup, common pre-build and
post-build steps as well as cleanup and logging properties.

It also offers a simple versioning system, allowing you to easily go back to
a past version of any job configuration and test new features without
affecting the runtime.

If you wish to see a video presenting the major features of this project and
how to use them, go watch this video tutorial: http://youtu.be/DNUI7DRi6XE


Have fun!
