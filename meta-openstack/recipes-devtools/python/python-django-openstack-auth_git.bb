DESCRIPTION = "A Django authentication backend for use with the OpenStack Keystone backend."
HOMEPAGE = "http://django_openstack_auth.readthedocs.org/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRCNAME = "django_openstack_auth"

PV = "2.4.2+git${SRCPV}"
SRCREV = "08e96550a31b98b7ee3278b3b6a73e93e79ac343"

SRC_URI = "git://github.com/openstack/${SRCNAME}.git;branch=stable/newton \
"

S = "${WORKDIR}/git"

inherit setuptools 

DEPENDS += " \
        python-pip \
        python-pbr \
        "

RDEPENDS_${PN} += " \
        python-pbr \
        python-django \
        python-oslo.config \
        python-oslo.policy \
        python-keystoneclient \
        python-keystoneauth1 \
        python-six \
        "
