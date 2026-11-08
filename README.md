# WatchPorn Provider (CloudStream starter)

A CloudStream provider scaffold for a site you own or are authorized to integrate.

> This starter intentionally does **not** scrape `watchporn.to`, extract hidden media URLs,
> defeat anti-bot controls, or bypass DRM/access restrictions. Before connecting a real source,
> use an authorized API/feed or a documented integration supplied by the site owner.

## What is included
- Kotlin CloudStream plugin entry point
- `MainAPI` provider scaffold
- Search and load URL method placeholders
- Build metadata and Android manifest
- Notes for completing an authorized integration

## Build
Use the current CloudStream extension template/build system and its supported JDK/Android SDK.
The exact Gradle plugin version and provider API should be aligned with the template version
you choose; CloudStream APIs can change.

Official developer guide: https://recloudstream.github.io/csdocs/devs/gettingstarted/

## Next integration step
Obtain the site's documented API/feed specification or a sample response for:
1. Search
2. Category listing and pagination
3. Item details
4. Authorized playback source

Then implement those endpoints in `WatchPornProvider.kt`. Do not hard-code credentials.
