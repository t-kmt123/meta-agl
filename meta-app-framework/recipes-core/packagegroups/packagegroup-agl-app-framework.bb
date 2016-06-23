SUMMARY = "AGL Application Framework core packages"
DESCRIPTION = "The set of packages required by the AGL Application Framework"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-app-framework \
    "

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += "\
	af-binder \
	af-main \
	web-runtime \
    "
