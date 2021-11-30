SRC := $(shell pwd)

obj-$(CONFIG_CH1) := ch1/miscdrv/
#obj-$(CONFIG_CH1) += miscdrv/miscdrv.o
#obj-m := $(obj-y)

all:
	@echo
	@echo '--- Building : Pitoooooooooooooooooo11 with=${obj-y}---'
	@echo
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules
#
modules_install:
	@echo
	@echo '--- Instalando segun.... ---'
	@echo
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules_install
#
clean:
	@echo
	@echo '--- Building : Limpiando mi gran Pitoooooooooooooooooo ---'
	@echo
	rm -f *.o *~ core .depend .*.cmd *.ko *.mod.c
	rm -f Module.markers Module.symvers modules.order
	rm -rf .tmp_versions Modules.symvers
#clean:
#
