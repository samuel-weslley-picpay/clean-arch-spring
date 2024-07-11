#!/bin/sh
set -e

exec $@ -Dlog4j2.formatMsgNoLookups=true