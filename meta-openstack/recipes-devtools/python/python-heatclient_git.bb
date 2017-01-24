DESCRIPTION = "CLI and python client library for OpenStack Heat"
HOMEPAGE = "https://launchpad.net/heat"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += " \
        python-pip \
        python-pbr \
        "

# Satisfy setup.py 'setup_requires'
DEPENDS += " \
        python-pbr-native \
        "

RDEPENDS_${PN} += " \
        python-babel \
        python-pbr \
        python-cliff \
        python-iso8601 \
        python-osc-lib \
        python-prettytable \
        python-oslo.i18n \
        python-oslo.serialization \
        python-oslo.utils \
        python-keystoneauth1 \
        python-swiftclient \
        python-pyyaml \
        python-requests \
        python-six \
        "
SRCNAME = "heatclient"

SRC_URI = "git://github.com/openstack/python-heatclient.git;branch=stable/newton"

PV = "1.5.0+git${SRCPV}"
SRCREV = "3c3f8ee2c6c988c95c949cb20fa7969a7e4a9c1a"
S = "${WORKDIR}/git"

inherit setuptools


PACKAGECONFIG ?= "bash-completion"
PACKAGECONFIG[bash-completion] = ",,bash-completion,bash-completion ${BPN}-bash-completion"

do_install_append() {
	install -d ${D}/${sysconfdir}/bash_completion.d
	install -m 664 ${S}/tools/heat.bash_completion ${D}/${sysconfdir}/bash_completion.d
}

PACKAGES =+ "${SRCNAME}-tests ${BPN}-bash-completion"
FILES_${BPN}-bash-completion = "${sysconfdir}/bash_completion.d/*"
ALLOW_EMPTY_${SRCNAME}-tests = "1"

RDEPENDS_${SRCNAME}-tests += "python-testscenarios \
	python-mox3 \
	"
