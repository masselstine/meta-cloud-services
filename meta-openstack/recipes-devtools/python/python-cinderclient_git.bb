DESCRIPTION = "Client library for OpenStack Cinder API."
HOMEPAGE = "https://github.com/openstack/python-cinderclient"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3572962e13e5e739b30b0864365e0795"
DEPENDS = "python-setuptools-git"

SRCNAME = "python-cinderclient"

SRC_URI = "\
	git://github.com/openstack/python-cinderclient.git;branch=stable/newton \
	file://cinder-api-check.sh \
	"

PV="1.9.0+git${SRCPV}"
SRCREV="3d31630c9a519f18b0d957b03dea42fa8f502354"
S = "${WORKDIR}/git"

inherit setuptools monitor rmargparse

DEPENDS += " \
        python-pip \
        python-pbr \
        "

RDEPENDS_${PN} += " \
        python-pbr \
        python-prettytable \
        python-keystoneauth1 \
        python-requests \
        python-simplejson \
        python-babel \
        python-six \
        python-oslo.i18n \
        python-oslo.utils \
        "
	
PACKAGECONFIG ?= "bash-completion"
PACKAGECONFIG[bash-completion] = ",,bash-completion,bash-completion ${BPN}-bash-completion"

do_install_append() {
	install -d ${D}/${sysconfdir}/bash_completion.d
	install -m 664 ${S}/tools/cinder.bash_completion ${D}/${sysconfdir}/bash_completion.d
}

PACKAGES =+ "${BPN}-bash-completion"
FILES_${BPN}-bash-completion = "${sysconfdir}/bash_completion.d/*"

MONITOR_CHECKS_${PN} += "\
	cinder-api-check.sh \
"
