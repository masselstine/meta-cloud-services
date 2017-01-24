DESCRIPTION = "Middleware for OpenStack Identity API"
HOMEPAGE = "https://launchpad.net/keystonemiddleware"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a4d0e932ffae1c0131528d30d419c55"

SRCNAME = "keystonemiddleware"

SRC_URI = "\
	git://git.openstack.org/openstack/keystonemiddleware;branch=stable/newton \
	"

PV = "4.9.0+git${SRCPV}"
SRCREV = "675ac3effa8649d162dabe25aea6d241a6f54b2b"
S = "${WORKDIR}/git"

inherit setuptools

DEPENDS += " \
        python-pip \
        python-pbr \
        "

RDEPENDS_${PN} += " \
        python-keystoneauth1 \
        python-oslo.config \
        python-oslo.context \
        python-oslo.i18n \
        python-oslo.serialization \
        python-oslo.utils \
        python-pbr \
        python-positional \
        python-pycadf \
        python-keystoneclient \
        python-requests \
        python-six \
        python-webob \
        "
