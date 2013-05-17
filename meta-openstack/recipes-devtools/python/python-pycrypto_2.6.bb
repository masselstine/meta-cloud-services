DESCRIPTION = "Cryptographic modules for Python."
HOMEPAGE = "http://www.pycrypto.org/"
SECTION = "devel/python"
LICENSE = "PSFv2"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=35f354d199e8cb7667b059a23578e63d"

PR = "r0"
SRCNAME = "pycrypto"

SRC_URI = "https://ftp.dlitz.net/pub/dlitz/crypto/pycrypto/${SRCNAME}-${PV}.tar.gz \
           file://cross-compiling.patch"

SRC_URI[md5sum] = "88dad0a270d1fe83a39e0467a66a22bb"
SRC_URI[sha256sum] = "7293c9d7e8af2e44a82f86eb9c3b058880f4bcc884bf3ad6c8a34b64986edde8"

S = "${WORKDIR}/${SRCNAME}-${PV}"

export BUILD_SYS
export HOST_SYS

inherit distutils