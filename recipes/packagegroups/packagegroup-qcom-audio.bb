SUMMARY = "Audio Reach Package Group"

LICENSE = "BSD-3-Clause"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "${PN}"

PULSEAUDIO_PKGS = " \
    pulseaudio-server \
    pulseaudio-module-loopback \
    pulseaudio-module-null-source \
    pulseaudio-module-combine-sink \
    pulseaudio-module-switch-on-port-available \
    pulseaudio-misc \
    pulseaudio-module-dbus-protocol \
    pulseaudio-module-bluetooth-discover \
    pulseaudio-module-bluetooth-policy \
    pulseaudio-module-bluez5-discover \
    pulseaudio-module-bluez5-device \
"

PULSEAUDIO_PKGS += " \
    pulseaudio-module-pal-card \
"

RDEPENDS:${PN} = ' \
    tinyalsa \
    tinycompress \
    audioreach-audio-utils \
    audioreach-conf \
    audioreach-graphmgr \
    audioreach-graphservices \
    audioreach-pal \
    ${PULSEAUDIO_PKGS}  \
'
