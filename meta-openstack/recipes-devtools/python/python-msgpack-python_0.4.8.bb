DESCRIPTION = "MessagePack (de)serializer"
HOMEPAGE = "https://pypi.python.org/pypi/msgpack-python/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=cd9523181d9d4fbf7ffca52eaa2a5751"

SRCNAME = "msgpack-python"

SRC_URI = "https://pypi.io/packages/source/m/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "dcd854fb41ee7584ebbf35e049e6be98"
SRC__URI[sha256sum] = "1a2b19df0f03519ec7f19f826afb935b202d8979b0856c6fb3dc28955799f886"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
