# Authorized integration checklist

Before implementing the provider, obtain written permission and technical details from the site owner.

- [ ] Documented API/feed base URL
- [ ] Search endpoint and example JSON response
- [ ] Category endpoint, page parameter, and example response
- [ ] Details endpoint and stable content identifier
- [ ] Authorized playback URL format and expiry behavior
- [ ] Terms permitting third-party client playback
- [ ] Test content that is approved for integration

Do not attempt to defeat CAPTCHA, login walls, geo restrictions, DRM, signed-token protections,
or anti-bot controls. If the service requires an authenticated account, use only an official
authorization flow and never embed personal credentials in the extension.
