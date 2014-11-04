#include<stdio.h>
#include<pthread.h>

int sum;
pthread_t threadx;
pthread_t thready;
void *inc_x(void *x_void_ptr)
{
int *x_ptr = (int *)x_void_ptr;
while(++(*x_ptr) <200);
printf(" x finished)=");
return NULL;
}

int main() {
int x=0,y=0;
printf("x :%d, y:%d",x,y);
pthread_t inc_x_thread;
if(pthread_create(&inc_x_thread,NULL,inc_x,&x)) {
fprintf(stderr,"error creating thread");
return 1;
}

while(++y <100);
prinf("y incremented");
if(pthread_join(inc_x_thread,NULL)) {
	fprintf(stderr, "error joining thread);
	return 2;
	}
	
	printf("x :%d,y:%d" x,y);
	return 0;
	}