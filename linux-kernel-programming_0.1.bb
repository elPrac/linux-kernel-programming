SUMMARY = "Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "file://Makefile \
           file://ch1/ \
           file://convenient.h \
           file://COPYING \
          "
#PACKAGECONFIG ??= "ch1"
PACKAGECONFIG[ch1] = "CONFIG_CH1=y,,"
EXTRA_OEMAKE_append = " ${PACKAGECONFIG_CONFARGS}"
S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

# TODO: example from meta-openembedded/meta-oe/recipes-support/vboxguestdrivers/vboxguestdrivers_6.1.6.bb
#PACKAGES += "kernel-module-vboxguest kernel-module-vboxsf kernel-module-vboxvideo"
#RRECOMMENDS_${PN} += "kernel-module-vboxguest kernel-module-vboxsf kernel-module-vboxvideo"

RPROVIDES_${PN} += "kernel-module-programming"
PACKAGE_ARCH = "${MACHINE_ARCH}"
