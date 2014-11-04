import os
def createchild():
	print' new child' os.getpid()
	os._exit()
	
def parent():
	while 