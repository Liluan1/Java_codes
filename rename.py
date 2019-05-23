import os

dir_name = str(input('input dir\n'))
file_name = os.listdir('./'+dir_name)
i = 1
for name in file_name:
	os.rename(dir_name+'/'+name, dir_name+'/'+'exp_'+str(i)+'.java')
	i += 1