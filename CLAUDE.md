# wadachi repository rules

- Treat `manifest.edn`, `identity.edn`, `dependencies.edn`, `repository-contracts.edn`, `schema/`, `contracts/`, and `data/` as canonical EDN.
- Keep externally exchanged JSON, JSON-LD, and BPMN under `wire/` only.
- Keep production code under `src/wadachi/` and tests under `test/wadachi/`.
- Do not restore monorepo-relative paths, Go/TinyGo ports, generated WASM binaries, or shell launchers.
- Preserve the constitutional mobility gates and operator consent boundaries.
- Run `bb test` plus the EDN and artifact audits before publishing.
